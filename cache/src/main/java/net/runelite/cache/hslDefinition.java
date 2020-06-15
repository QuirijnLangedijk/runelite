package net.runelite.cache;

public class hslDefinition {
    public transient int saturation;
    public transient int lightness;
    public double var12;
    public double var16;
    public double var14;

    public hslDefinition(int saturation, int lightness, double var12, double var14, double var16) {
        this.saturation = saturation;
        this.lightness = lightness;
        this.var12 = var12;
        this.var14 = var14;
        this.var16 = var16;
    }

    public static hslDefinition calculateHsl(int color) {
        double var2 = (double) (color >> 16 & 255) / 256.0D;
        double var4 = (double) (color >> 8 & 255) / 256.0D;
        double var6 = (double) (color & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2)
        {
            var8 = var4;
        }

        if (var6 < var8)
        {
            var8 = var6;
        }

        double var10 = var2;
        if (var4 > var2)
        {
            var10 = var4;
        }

        if (var6 > var10)
        {
            var10 = var6;
        }

        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var10 + var8) / 2.0D;
        if (var8 != var10)
        {
            if (var16 < 0.5D)
            {
                var14 = (var10 - var8) / (var8 + var10);
            }

            if (var16 >= 0.5D)
            {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var2 == var10)
            {
                var12 = (var4 - var6) / (var10 - var8);
            }
            else if (var10 == var4)
            {
                var12 = 2.0D + (var6 - var2) / (var10 - var8);
            }
            else if (var10 == var6)
            {
                var12 = 4.0D + (var2 - var4) / (var10 - var8);
            }
        }

        var12 /= 6.0D;
        int saturation = (int) (var14 * 256.0D);
        int lightness = (int) (var16 * 256.0D);
        if (saturation < 0)
        {
            saturation = 0;
        }
        else if (saturation > 255)
        {
            saturation = 255;
        }

        if (lightness < 0)
        {
            lightness = 0;
        }
        else if (lightness > 255)
        {
            lightness = 255;
        }

        return new hslDefinition(saturation, lightness, var12, var14, var16);
    }




}
