/**
 * Created by Joshua on 10/9/2016.
 */
public class EnchantedMazeFactory implements MazeFactory
{

    public Room addRoom()
    {
        return new EnchantedRoom();
    }

    public Door addDoor()
    {
        return new EnchantedDoor();
    }

    public Wall addWall()
    {
        return new EnchantedWall();
    }

}
