package net.KanasakiTechnologics.DecoBuild.Fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

public class MoltenIron {
    public static class Source extends BaseFlowingFluid.Source {
        public Source(Properties props) {
            super(props);
        }
    }

    public static class Flowing extends BaseFlowingFluid.Flowing {
        public Flowing(Properties props) {
            super(props);
        }
    }
}
