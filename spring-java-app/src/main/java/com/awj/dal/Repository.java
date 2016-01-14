package com.awj.dal;

import com.awj.models.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radu on 14/01/16.
 */
public class Repository<TEntity extends Model<TEntity>> {
    private List<TEntity> Entities;

    public List<TEntity> getAll(){
        return Entities;
    }

    public void add(TEntity entity){
        Entities.add(entity);
    }

    public void delete(Integer id){

        TEntity entityToDelete = null;

        for(TEntity e : Entities){
            if(e.getId() == id)
                entityToDelete = e;
        }

        Entities.remove(entityToDelete);
    }

    public void update(TEntity entity){

        TEntity entityToUpdate = null;

        for(TEntity e : Entities){
            if(e.getId() == entity.getId())
                entityToUpdate = e;
        }

        if(entityToUpdate != null)
            entityToUpdate.update(entity);
    }

    public TEntity getById(Integer id){
        for(TEntity entity : Entities)
            if(entity.getId() == id)
                return entity;
        return null;
    }

    public Repository(){
        Entities = new ArrayList<TEntity>();
    }
}
