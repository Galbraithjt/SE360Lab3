/**
 * Created by Joshua on 10/9/2016.
 */
public class BombedMaze extends Maze
{

    MazeFactory mazeFactory;

    public BombedMaze(MazeFactory mazeFactory)
    {
        this.mazeFactory = mazeFactory;
    }

    void makeMaze()
    {
        System.out.println("Making maze " + getName()); // makes bombed maze

        room = mazeFactory.addRoom();
        door = mazeFactory.addDoor();
        wall = mazeFactory.addWall();
    }
}
