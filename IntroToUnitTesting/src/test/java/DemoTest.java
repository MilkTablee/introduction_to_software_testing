import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

public class DemoTest {
	
	@Before
	public void setUp() {
		// Initialisation, if needed
	}
	
	@After
	public void tearDown() {
		// Cleanup, if needed
	}
	
	@Test
	public void testValidTriangle() {
		assertTrue(Demo.isTriangle(3, 4, 5)); // Valid triangle (Pythagorean triplet)
        assertTrue(Demo.isTriangle(5, 12, 13)); // Valid triangle (another Pythagorean triplet)
        assertTrue(Demo.isTriangle(7, 8, 9)); // Valid triangle
	}
	
	@Test
    public void testInvalidTriangle() {
        assertFalse(Demo.isTriangle(1, 1, 3)); // Invalid triangle (sum of two sides not greater than the third)
        assertFalse(Demo.isTriangle(3, 4, 7)); // Invalid triangle (sum of two sides not greater than the third)
        assertFalse(Demo.isTriangle(0, 0, 0)); // Invalid triangle (zero side lengths)
    }
	
	@Test
    public void testNegativeSideLengths() {
        assertFalse(Demo.isTriangle(-3, 4, 5)); // Negative side length
        assertFalse(Demo.isTriangle(3, -4, 5)); // Negative side length
        assertFalse(Demo.isTriangle(3, 4, -5)); // Negative side length
        assertFalse(Demo.isTriangle(-3, -4, -5)); // Negative side lengths
    }

    @Test
    public void testZeroSideLengths() {
        assertFalse(Demo.isTriangle(0, 4, 5)); // Zero side length
        assertFalse(Demo.isTriangle(3, 0, 5)); // Zero side length
        assertFalse(Demo.isTriangle(3, 4, 0)); // Zero side length
        assertFalse(Demo.isTriangle(0, 0, 0)); // Zero side lengths
    }

    @Test
    public void testDifferentOrder() {
        assertTrue(Demo.isTriangle(3, 4, 5)); // Same as first valid triangle test
        assertTrue(Demo.isTriangle(5, 3, 4)); // Permutation of side lengths
        assertTrue(Demo.isTriangle(4, 5, 3)); // Permutation of side lengths
    }

    @Test
    public void testIsoscelesTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 7)); // Isosceles triangle
        assertTrue(Demo.isTriangle(5, 7, 5)); // Isosceles triangle
        assertTrue(Demo.isTriangle(7, 5, 5)); // Isosceles triangle
    }

    @Test
    public void testEquilateralTriangle() {
        assertTrue(Demo.isTriangle(5, 5, 5)); // Equilateral triangle
    }
    
    @Test
    public void testVeryLargeNumbers() {
        assertTrue(Demo.isTriangle(1_000_000_000, 1_000_000_000, 1_000_000_000));
        assertFalse(Demo.isTriangle(1_000_000_000, 1_000_000_000, 2_000_000_000));
    }

    @Test
    public void testFloatingPointPrecision() {
        assertFalse(Demo.isTriangle(0.1, 0.2, 0.3));
    }

    @Test
    public void testInvalidInput() {
        assertFalse(Demo.isTriangle(Double.NaN, 1, 1));
        assertFalse(Demo.isTriangle(Double.POSITIVE_INFINITY, 1, 1));
    }

    @Test
    public void triangle_test_1() {
        assertTrue(Demo.isTriangle(3,2,4));
    }
    
    @Test
    public void triangle_test_2() {
        assertTrue(Demo.isTriangle(4,3,5));
    }
    
    @Test
    public void triangle_test_3() {
        assertTrue(Demo.isTriangle(5,3,5));
    }
    
    @Test
    public void triangle_test_4() {
        assertTrue(Demo.isTriangle(6,4,5));
    }
    
    @Test
    public void triangle_test_5() {
        assertTrue(Demo.isTriangle(7,5,6));
    }
    
    @Test
    public void triangle_test_6() {
        assertFalse(Demo.isTriangle(13,2,4));
    
    }
    
    @Test
    public void triangle_test_7() {
        assertFalse(Demo.isTriangle(4,3,15));
    }
    
    @Test
    public void triangle_test_8() {
        assertFalse(Demo.isTriangle(3,22,4));
    }
    
    @Test
    public void triangle_test_9() {
        assertFalse(Demo.isTriangle(24,2,5));
    }
    
    @Test
    public void triangle_test_10() {
        assertFalse(Demo.isTriangle(34,2,4));
    }
    
    
    @Test
    public void triangle_test_11() {
        assertFalse(Demo.isTriangle(2,10,4));
    }
}
