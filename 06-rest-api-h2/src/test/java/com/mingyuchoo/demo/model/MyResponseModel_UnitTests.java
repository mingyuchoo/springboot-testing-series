package com.mingyuchoo.demo.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MyResponseModel_UnitTests {

    private MyResponseModel myResponseModel = new MyResponseModel();

    @Test
    void getMessage() {
        assertThat(myResponseModel.getMessage()).isEqualTo(null);
    }

    @Test
    void setMessage() {
        myResponseModel.setMessage("hello");
        assertThat(myResponseModel.getMessage()).isEqualTo("hello");
    }

    @Test
    void isSuccess() {
        assertThat(myResponseModel.isSuccess()).isEqualTo(false);
    }

    @Test
    void setSuccess() {
        myResponseModel.setSuccess(true);
        assertThat(myResponseModel.isSuccess()).isEqualTo(true);
    }
}
