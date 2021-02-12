package org.swdc.antlr.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.swdc.expression.el.ElExpression;

import java.util.HashMap;
import java.util.Map;

public class ElTest {

    @Test
    public void testElCalcute() {
        Map<String,Object> env = new HashMap<>();
        env.put("test", Map.of("arr",Map.of("name",Map.of("radius",3d))));

        ElExpression elExpression = new ElExpression();
        double rst = elExpression.withEnvironment(env).parse("${test.arr[\"name\"].radius * 3.14 + 12}");
        Assertions.assertNotEquals(rst,0);
    }

    @Test
    public void testObject() {
        Map<String,Object> map = Map.of("test",Map.of("name","nametest"));

        ElExpression elExpression = new ElExpression();
        Map mapTest  =elExpression.withEnvironment(map).parse("${test}");
        Assertions.assertEquals(map.get("test"),mapTest);
    }

}
