package chapter14.factory;

public class FuelFilter extends Filter{
    public static class Factory implements chapter14.factory.Factory<FuelFilter> {

        @Override
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}
