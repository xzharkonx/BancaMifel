package com.banca.mifel.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.banca.mifel.models.entity.Item;

public interface IItemService {

	public List<Item> findAll();
	
	public Page<Item> findAll(Pageable pageable);
	
	public Item findById(Long id);
	
	public Item findByNombre(String nombre);
	
	public Item save(Item item);
	
	public void delete(Long id);

}
