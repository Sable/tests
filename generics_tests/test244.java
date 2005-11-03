interface test244<B extends test244<B>> {}
interface Model extends test244<Model> {}
interface View<T extends Model,U> extends test244<View<?,?>> {}
