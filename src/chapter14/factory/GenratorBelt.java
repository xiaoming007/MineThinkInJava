package chapter14.factory;

public class GenratorBelt extends Belt{
    public static class Factory implements chapter14.factory.Factory<GenratorBelt>{

        @Override
        public GenratorBelt create() {
            return new GenratorBelt();
        }
    }
}
