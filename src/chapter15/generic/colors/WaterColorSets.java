package chapter15.generic.colors;

import java.util.EnumSet;
import java.util.Set;
import static chapter15.generic.colors.WaterColors.*;
import static util.Sets.*;

public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(ZINC,LEMON_YELLOW);
        Set<WaterColors> set2 = EnumSet.range(MEDIUM_YELLOW, DEEP_YELLOW);
        System.out.println("set1" + set1);
        System.out.println("set2" + set2);
        System.out.println("union(set1,set2):" + union(set1,set2));
        Set<WaterColors> subset = intersection(set1,set2);


    }
}
