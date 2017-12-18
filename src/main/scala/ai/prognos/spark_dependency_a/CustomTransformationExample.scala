package ai.prognos.spark_dependency_a

import org.apache.spark.sql.DataFrame

class CustomTransformationExample {
  def snakeCaseColumns(df: DataFrame): DataFrame = {
    df.filter()
    df.columns.foldLeft(df) { (memoDF, colName) =>
      memoDF.withColumnRenamed(colName, toSnakeCase(colName))
    }
  }
}
