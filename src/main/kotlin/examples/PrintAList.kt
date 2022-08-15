import data.creditcard.Category
import data.creditcard.CreditCardBill
import data.creditcard.Expense

fun main(){
    val movie:Expense=Expense(1,"Cheluvina Chilipili",Category.ENTERTAINMENT,500.0)
    val saturdayNightDinner:Expense=Expense(2,"Dinner at Shiv Sagar",Category.FOOD,990.0)
    val sundayMorningBf:Expense=Expense(3,"Breakfast at Veena stores",Category.FOOD,200.0)
    val weeklyRefuel:Expense= Expense(4,"Petrol 5L Blore", Category.FUEL,500.0)

    val augBill:CreditCardBill = CreditCardBill(listOf(movie,saturdayNightDinner,sundayMorningBf,weeklyRefuel))

    //List all food expenses , imperative way
    for(bill in augBill.expenseList){
        if(bill.category== Category.FOOD){
            println(bill)
        }
    }


    //This is a more functional way of doing it.
    println(augBill.expenseList.filter { bill->bill.category==Category.FOOD })

}
