package chapter14.factory;

public class FanBelt extends Belt{
    public static class Factory implements chapter14.factory.Factory<FanBelt>{

        @Override
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
