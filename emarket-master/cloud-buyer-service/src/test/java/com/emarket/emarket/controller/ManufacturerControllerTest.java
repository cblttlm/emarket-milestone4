package com.emarket.emarket.controller;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.emarket.emarket.entity.CategoryEntity;
import com.emarket.emarket.service.CategoryService;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ManufacturerControllerTest extends TestCase {
    @Autowired
    private CategoryService service;
    @Autowired
    private MockMvc mvc;

    public void setUp() throws Exception {
        super.setUp();
    }
    public void tearDown() throws Exception {
    }
    @Test
    public void getManufacturerListShouldReturnDetails()
            throws Exception {
        this.mvc.perform(get("/api/manufacturer")).andExpect(status().isOk());
        List<CategoryEntity> categoryEntityList = this.service.getManufacturerList();
        for(int nIndex=0;nIndex <categoryEntityList.size();nIndex++)
        {
            assertThat(categoryEntityList.get(nIndex).getCategoryId()).isEqualTo(nIndex+1);
        }

    }
}