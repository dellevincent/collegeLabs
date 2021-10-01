import java.io.*;
/**
 * Write a description of class MethodClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MethodClass
{
    public void add(int index, Object item)
                  throws ListIndexOutOfBoundsException 
  {
    if (index >= 0 && index < numItems+1) 
    {
      if (index == 0 && numItems==0) 
      {
        // insert the new node containing item at
        // beginning of list
        DNode newNode = new DNode(item, head, tail);
        head = (DNode)newNode.getNext();
        tail = head;
      } 
      else 
      {
        Node prev = find(index-1);
        // insert the new node containing item after 
        // the node that prev references
        Node newNode = new Node(item, prev.getNext());
        prev.setNext(newNode);
      } // end if
      numItems++;
    } 
    else 
    {
      throw new ListIndexOutOfBoundsException(
                    "List index out of bounds exception on add");
    } // end if
  }  // end add
}
