package data.creditcard

data class CreditCardBill(val expenseList:List<Expense>){
}

data class Expense(val id:Int,val name:String,val category:Category,val amount:Double) {

}

enum class Category {
    FOOD,ENTERTAINMENT,FUEL,MISC
}