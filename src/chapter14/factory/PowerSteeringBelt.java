package chapter14.factory;

public class PowerSteeringBelt extends Belt{
    public static class Factory implements chapter14.factory.Factory<PowerSteeringBelt>{

        @Override
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
