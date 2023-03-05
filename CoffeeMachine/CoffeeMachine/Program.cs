namespace CoffeeMachine
{
    using System;
    using System.Collections.Generic;


    public class Program
    {
        static void Main(string[] args)
        {
            var resources = new Dictionary<string, int>()
            {
                { "water", 300 },
                { "milk", 200 },
                { "coffee", 100 }
            };

            var menu = new Dictionary<string, Dictionary<string, object>>()
            {
                {
                    "espresso", new Dictionary<string, object>()
                    {
                        { "ingredients", new Dictionary<string, int>()
                        {
                            { "water", 50 },
                            { "coffee", 18 }
                        }
                        },
                        { "cost", 1.5 }
                    }
                },
                {
                    "latte", new Dictionary<string, object>()
                    {
                        { "ingredients", new Dictionary<string, int>()
                        {
                            { "water", 200 },
                            { "milk", 150 },
                            { "coffee", 24 }
                        }
                        },
                        { "cost", 2.5 }
                    }
                },
                {
                    "cappuccino", new Dictionary<string, object>()
                    {
                        { "ingredients", new Dictionary<string, int>()
                        {
                            { "water", 250 },
                            { "milk", 100 },
                            { "coffee", 24 }
                        }
                        },
                        { "cost", 3.0 }
                    }
                }
            };

            var sadReply = "Sorry that's not enough money. Money refunded.";
            var notEnoughReply = "Sorry there is not enough resources to make your coffee.";

            Func<Dictionary<string, int>, string, string> CheckResources = (currentResources, preference) =>
            {
                int water = 0;
                int coffee = 0;
                int milk = 0;
             


                if (preference == "espresso")
                {
                    var ingredients = (Dictionary<string, int>)menu[preference]["ingredients"];
                    water = currentResources["water"] - ingredients["water"];
                    coffee = currentResources["coffee"] - ingredients["coffee"];
                    milk = currentResources["milk"];

                }
                else if (preference == "latte" || preference == "cappuccino")
                {
                    var ingredients = (Dictionary<string, int>)menu[preference]["ingredients"];
                    water = currentResources["water"] - ingredients["water"];
                    coffee = currentResources["coffee"] - ingredients["coffee"];
                    milk = currentResources["milk"] - ingredients["milk"];

                }

                if (water < 0 || coffee < 0 || milk < 0)
                {
                    return notEnoughReply;
                }
                else
                {
                    currentResources["water"] = water;
                    currentResources["coffee"] = coffee;
                    currentResources["milk"] = milk;
                    return "Please insert coins";
                }
            };

            Func<string, string> ProcessCoins = (preference) =>
            {
                Console.Write("How many quarters: ");
                var q1 = Console.ReadLine();
                double quarters = Convert.ToDouble(q1);
                Console.Write("How many dimes: ");
                var q2 = Console.ReadLine();
                double dimes = Convert.ToDouble(q2);
                Console.Write("How many nickles: ");
                var q3 = Console.ReadLine();
                double nickles = Convert.ToDouble(q3);
                Console.Write("How many pennies: ");
                var q4 = Console.ReadLine();
                double pennies = Convert.ToDouble(q4);

                double total = quarters * 0.25 + dimes * 0.1 + nickles * 0.05 + pennies * 0.01;
                var totalMoney = total - (double)menu[preference]["cost"];
                if (totalMoney < 0)
                {
                    return sadReply;
                }
                else
                {
                    return $"Here is {totalMoney} in change\n Here is your {preference}. Enjoy!";
                }
            };
            int count = 0;
            bool isPlaying = true;
            while (isPlaying)
            {
                //Dictionary<string, int> currentResources = new Dictionary<string, int>(resources);
                Console.Write("What would you like? (espresso/latte/cappuccino):\n");
                var userPreference = Console.ReadLine();

                if (userPreference == "off")
                {
                    isPlaying = false;
                }
                else if (userPreference == "report" && count == 0)
                {
                    foreach (KeyValuePair<string, int> entry in resources)
                    {
                        Console.WriteLine("{0}: {1}", entry.Key, entry.Value);
                    }
                }
                else if (userPreference == "report" && count >= 1)
                {
                    foreach (KeyValuePair<string, int> entry in resources)
                    {
                        Console.WriteLine("{0}: {1}", entry.Key, entry.Value);
                    }
                }
                else
                {
                    var specificIngredients = menu[userPreference]["ingredients"];
                    count++;
                    string check = CheckResources(resources, userPreference);
                    Console.WriteLine(check);
                    if (check == notEnoughReply)
                    {
                        isPlaying = false;
                    }
                    else
                    {
                        string coins = ProcessCoins(userPreference);
                        Console.WriteLine(coins);
                    }
                }
            }


        }
    }
}