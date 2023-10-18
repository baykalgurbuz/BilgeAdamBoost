package DesingPattern;

public class Builder {
    //İşte bu uzayıp giden parametre sayısından, karmaşık constructorlardan kurtarmak için Builder Pattern güzel bir çözüm sunuyor.
    private String marka ;
    private String model;
    private String renk;
    private Builder(){}
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getRenk() {
        return renk;
    }
    public static class BuilderClass{
        private String marka;
        private String model;
        private String renk;
        public BuilderClass marka(String marka) {
            this.marka = marka;
            return this;
        }
        public BuilderClass model(String model) {
            this.model = model;
            return this;
        }

        public BuilderClass renk(String renk) {
            this.renk = renk;
            return this;
        }
        public Builder build()
        {
            Builder builder=new Builder();
            builder.marka=this.marka;
            builder.model=model;
            builder.renk=renk;
            return builder;
        }


    }
}
