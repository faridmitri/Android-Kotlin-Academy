class Mobile(var brand: String, var model: String,var mrp:Float,var discount: Float) {

    private var  finalPrice:Float = 0f

    private  fun getActualPrice(){
               finalPrice = mrp - (mrp*discount/100)
            }

    fun printDetails(){
        getActualPrice()
        print("You bought $brand mobile \n Model: $model \n Price:USD $mrp \n Discount: $discount% \n Final Price: USD $finalPrice")
    }
}