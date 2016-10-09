/**
 * Created by Joshua on 10/9/2016.
 */
public class AbstractFactoryTest
{
    public static void main(String[] args)
    {
        CreateMaze MakeEnchantedMaze = new CreateEnchantedMaze(); // new maze

        Maze enchanted = MakeEnchantedMaze.orderTheMaze("Enchanted"); // creates a enchanted maze

        System.out.println(enchanted + "\n");
        Maze bombed = MakeEnchantedMaze.orderTheMaze("Bombed"); // creates a bombed maze
        System.out.println(bombed + "\n");
    }

}
