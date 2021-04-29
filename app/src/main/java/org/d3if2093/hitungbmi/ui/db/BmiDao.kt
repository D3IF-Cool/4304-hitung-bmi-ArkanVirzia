package org.d3if2093.hitungbmi.ui.db

@Dao
interface BmiDao {
    @Insert
    fun insert(bmi: BmiEntity)
    @Query
    ("SELECT * FROM bmi ORDER BY id DESC LIMIT 1")
    fun getLastBmi(): LiveData<BmiEntity?>
}