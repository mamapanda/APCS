/**
 * Class Notes
 * 
 * @author Daniel Phan
 * @version 10.31.16
 */
import java.util.ArrayList;
import java.util.stream.*;

public class NotesArrayList
{
//ArrayList
    //import java.util.ArrayList;
    //ArrayList is a more advanced kind of array (able to collect objects)
    //2 significant differences over array
        //(1) ArrayList can grow or shrink as needed
        //(2) ArrayList class supplies methods for many common tasks, such as inserting and removing elements
    //Example
    public class Student
    {
        private String name;

        public Student (String name)
        {
            this.name = name;
        }
    }
    public class School
    {
        private ArrayList<Student> roster;

        public School()
        {
            roster = new ArrayList<Student>();
        }

        public void addStudent()
        {
            this.roster.add(new Student("Henry"));

            Student kyle = new Student("Kyle");
            this.roster.add(kyle);
            this.roster.add(1, new Student("Vincent")); //same as Insert()
            //pushes other students over automatically

            //roster --> Henry, Kyle
            //note: roster.size() is 2
            //Henry is index0, Kyle is index 1
        }
        public Student getStudent(int index)
        {
            //RETRIEVE ELEMENT IN ARRAYLIST
            Student dummy = roster.get(/* index */ index); //dummy is Henry

            Student biggerDummy = roster.get(roster.size()); //out of bound error
            return dummy;
        }
        public void removeStudent(int index)
        {
            roster.remove(index);
        }
        /**
         * Common mistake
         * 
         * Array a       a.length
         * ArrayList a   a.size()
         * String a      a.length()
         */
    }
}