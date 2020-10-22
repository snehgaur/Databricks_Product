// Databricks notebook source
dbutils.widgets.text("business_name", "")
val business_name = dbutils.widgets.get("business_name")

// COMMAND ----------

dbutils.notebook.exit("No New File -> Job Exit")