package com.awj.models;

/**
 * Created by Radu on 14/01/16.
 */
public abstract class Model<TModel extends Model> {
    protected Integer id;

    public Integer getId(){
        return id;
    }

    public abstract void update(TModel model);
}