package com.banca.mifel.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banca.mifel.models.dao.IItemDao;
import com.banca.mifel.models.entity.Item;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemDao itemDao;

	@Override
	@Transactional(readOnly = true)
	public List<Item> findAll() {
		return (List<Item>) itemDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Item> findAll(Pageable pageable) {
		return itemDao.findAll(pageable);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Item findById(Long id) {
		return itemDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Item save(Item item) {
		return itemDao.save(item);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		itemDao.deleteById(id);
	}

	public Item findByNombre(String nombre) {
		return itemDao.findByNombre(nombre);
	}

}
