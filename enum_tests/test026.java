public enum test026{
    RED{
        public test026 next(){ return GREEN; }
    },
    GREEN{
        public test026 next(){ return YELLOW; }
    },
    YELLOW{
        public test026 next(){ return RED; }
    };

   public abstract test026 next();
}