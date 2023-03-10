package chapter14.factory;

public class OilFilter extends Filter{
    public static class Factory implements chapter14.factory.Factory<OilFilter> {

        @Override
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
