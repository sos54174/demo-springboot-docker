package com.example.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Test
	void contextLoads() {
	}

	 // 1. Unit Test
    @Test
    void helloTest() throws Exception {
        mockMvc.perform(get("/")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello Tekton!! v2"));
    }

}
