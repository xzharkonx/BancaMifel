package com.banca.mifel.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banca.mifel.models.entity.Item;

public interface IItemDao extends JpaRepository<Item, Long>{

	public Item findByNombre(String nombre);
}
