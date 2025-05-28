package com.antsyferov.shop.repo;

import com.antsyferov.shop.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
    
}
