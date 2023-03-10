package chapter14.factory;

public class CarbinAirFilter extends Filter{
    public static class Factory implements chapter14.factory.Factory<CarbinAirFilter> {

        @Override
        public CarbinAirFilter create() {
            return new CarbinAirFilter();
        }
    }
}
