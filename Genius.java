import java.util.*;
public class Genius {
        private Customer[] line; //array where queue will be held
        private int N; //number of customers in the queue  

public Genius(int maxLength)//initializes the array to store the queue in and its length
{
        line = new Customer[maxLength];
        N = 0;
}
public int findPlace(String name)
{
      for(int i = 1; i < line.length; i++)
      {
                if(line[i].returnName().equals(name))
                        return i;
      }
      return -1;
}
public void changeProblem(String name, String problem)
{
        int place = findPlace(name);
        if(place == -1)
                throw new IllegalStateException("No person exists under that name."); 
        line[place].changeProblem(problem);
}
public int lineLength()
{
        return N;
}
public Styring peek()
{
        return line[0].toString();
}
public void enqueue(Customer person)
{
        if(N >= line.length)
                throw new IllegalStateException("Can't add to a full queue.");
        line[N] = person;
        N++;
}
public Customer dequeue()
{
        if (line[0] == null)
                throw new IllegalStateException("Can't dequeue from an empty queue.");
        Customer firstPerson = line[0];
        N--;
        for(int i = 1; i < line.length; i++)
        {
                line[i-1] = line[i];
        }
        line[N] = null;
        return firstPerson;
}

}
