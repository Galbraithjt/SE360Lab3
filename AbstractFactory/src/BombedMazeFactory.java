/**
 * Created by Joshua on 10/9/2016.
 */
public class BombedMazeFactory implements MazeFactory
{
    public Room addRoom()
    {
        return new BombedRoom(); // returns bombed room
    }

    public Door addDoor()
    {
        return new BombedDoor(); // returns bombed door
    }

    public Wall addWall()
    {
        return new BombedWall(); // returns bombed wall
    }

}
