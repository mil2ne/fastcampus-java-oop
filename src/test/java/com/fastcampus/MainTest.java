package com.fastcampus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // given
        String[] args = {"9","4","3","2", "1"};

        // when & then
        Main.main(args);
    }
}