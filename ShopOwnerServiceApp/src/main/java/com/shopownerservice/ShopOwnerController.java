package com.shopownerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopOwnerController {

	@Autowired
	ShopOwnerRepository repo;

	@PostMapping("/addvalues")
	public ShopOwner saveShopOwner(@RequestBody ShopOwner shopowner) {
		return repo.save(shopowner);
	}

	@GetMapping("/displayall")
	public List<ShopOwner> displayAllShopOwner() {
		return (List<ShopOwner>) repo.findAll();
	}

	@GetMapping("/display/{id}")
	public ShopOwner getShopOwnerById(@PathVariable(value = "id") Integer id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Shop Owner not found " + id));

	}

	@DeleteMapping("/delete/{id}")
	public String deleteShopOwner(@PathVariable(value = "id") Integer id) {
		repo.deleteById(id);
		return "Deleted Successfully!";
	}

	@PutMapping("/update/{id}")
	public ShopOwner updateShopOwner(@PathVariable(value = "id") Integer id, @RequestBody ShopOwner shopowner) {
		ShopOwner exiting = repo.findById(id).orElseThrow(() -> new RuntimeException("Shop Owner not found " + id));
		exiting.setShopName(shopowner.getShopName() != null ? shopowner.getShopName() : exiting.getShopName());
		exiting.setOwnerName(shopowner.getOwnerName() != null ? shopowner.getOwnerName() : exiting.getOwnerName());
		exiting.setPhNumber(shopowner.getPhNumber() != null ? shopowner.getPhNumber() : exiting.getPhNumber());
		exiting.setPwd(shopowner.getPwd() != null ? shopowner.getPwd() : exiting.getPwd());
		repo.save(exiting);
		return exiting;
	}

}
