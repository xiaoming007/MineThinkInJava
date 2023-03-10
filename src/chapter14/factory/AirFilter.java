package chapter14.factory;

public class AirFilter extends Filter{
    public static class Factory implements chapter14.factory.Factory<AirFilter>{

        @Override
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
