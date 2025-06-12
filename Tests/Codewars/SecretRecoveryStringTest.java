package Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretRecoveryStringTest {

    private final SecretRecoveryString recover = new SecretRecoveryString();

    @Test public void secret1() {
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        assertEquals("whatisup", recover.recoverSecret(triplets));
    }

    @Test public void secret2() {
        char[][] triplets = {
                {'a', 'b', 'm'},
                {'b', 'e', 'j'},
                {'a', 'r', 'm'},
                {'b', 'r', 'o'},
                {'o', 'm', 'e'},
                {'b', 'r', 'm'}
        };
        assertEquals("abromej", recover.recoverSecret(triplets));
    }

    @Test public void secret3() {
        char[][] triplets = {
                {'t', 's', 'f'},
                {'a', 's', 'u'},
                {'m', 'a', 'f'},
                {'a', 'i', 'n'},
                {'s', 'u', 'n'},
                {'m', 'f', 'u'},
                {'a', 't', 'h'},
                {'t', 'h', 'i'},
                {'h', 'i', 'f'},
                {'m', 'h', 'f'},
                {'a', 'u', 'n'},
                {'m', 'a', 't'},
                {'f', 'u', 'n'},
                {'h', 's', 'n'},
                {'a', 'i', 's'},
                {'m', 's', 'n'},
                {'m', 's', 'u'}
        };
        assertEquals("mathisfun", recover.recoverSecret(triplets));
    }
}