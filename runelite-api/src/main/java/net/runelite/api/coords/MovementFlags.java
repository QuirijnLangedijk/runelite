package net.runelite.api.coords;

public class MovementFlags {
    int xFlags;
    int yFlags;
    int xyFlags;
    int xWallFlagsSouth;
    int xWallFlagsNorth;
    int yWallFlagsWest;
    int yWallFlagsEast;

    public MovementFlags(int xFlags, int yFlags, int xyFlags, int xWallFlagsNorth, int xWallFlagsSouth, int yWallFlagsWest, int yWallFlagsEast) {
        this.xFlags = xFlags;
        this.yFlags = yFlags;
        this.xyFlags = xyFlags;
        this.xWallFlagsNorth = xWallFlagsNorth;
        this.xWallFlagsSouth = xWallFlagsSouth;
        this.yWallFlagsWest = yWallFlagsWest;
        this.yWallFlagsEast = yWallFlagsEast;
    }
}
