package io.shardingsphere.api.algorithm.identify;

/**
 *
 * @author shaojie
 * @since 2019/1/31
 */
public interface ActualTableIdentifierAlgorithm {

    boolean isActualTable(String actualTableName);

}
