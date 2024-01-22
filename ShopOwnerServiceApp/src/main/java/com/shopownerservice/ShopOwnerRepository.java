package com.shopownerservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopOwnerRepository extends CrudRepository<ShopOwner,Integer>
{

}
