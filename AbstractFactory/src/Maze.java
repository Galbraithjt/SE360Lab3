/**
 * Created by Joshua on 10/9/2016.
 */
public abstract class Maze
{
    private String name;

    Room room;
    Door door;
    Wall wall;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

    abstract void makeMaze();

    public String toString() // prints maze info
    {
        String infoMaze = "The " + name + " Maze has a " + room +
        " and " + wall + "s with a " + door ;
        return infoMaze;
    }

}
