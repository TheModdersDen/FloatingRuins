package bspkrs.floatingruins;

import java.util.Random;

import net.minecraft.world.World;

public final class IslandGenOptions
{
    public final int    radius;
    public final int    depth;
    public final int    islandType;
    public final World  world;
    public final Random random;
    public final int    x;
    public final int    y;
    public final int    z;
    
    public IslandGenOptions(World world, Random random, int x, int y, int z, int radius, int depth, int islandType)
    {
        this.world = world;
        this.random = random;
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.depth = depth;
        this.islandType = islandType;
    }
}
