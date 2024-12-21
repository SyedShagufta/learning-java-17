package com.learning.challenges.abstractChallenge;

import java.util.ArrayList;

public class Store {

    public static void main(String[] args) {

        ArrayList<ProductForSale> products = new ArrayList<>();

        // Adding Electronics products
        products.add(new Laptop("Electronics", 100000,
                "Dell Inspiron:\n" +
                        "- High-performance laptop for gaming and programming.\n" +
                        "- 15.6-inch FHD anti-glare display for an immersive experience.\n" +
                        "- Powered by Intel Core i7 processor.\n" +
                        "- 16GB DDR4 RAM for seamless multitasking.\n" +
                        "- 512GB SSD for fast storage and boot times.\n" +
                        "- Dedicated NVIDIA graphics for smooth visuals.\n" +
                        "- Backlit keyboard for comfortable typing in low light.\n" +
                        "- Long battery life with fast charging support."));

        products.add(new Mobile("Electronics", 80000,
                "Apple iPhone 14:\n" +
                        "- Flagship smartphone with cutting-edge technology.\n" +
                        "- A15 Bionic chip for unmatched speed and performance.\n" +
                        "- 6.1-inch Super Retina XDR display for stunning visuals.\n" +
                        "- Advanced dual-camera system with Night mode.\n" +
                        "- 5G-ready for faster connectivity.\n" +
                        "- Ceramic Shield for added durability.\n" +
                        "- iOS ecosystem integration for seamless usage.\n" +
                        "- Water and dust resistance (IP68 certified)."));

        products.add(new Laptop("Electronics", 87000,
                "Dell XPS:\n" +
                        "- Compact and lightweight laptop for professionals.\n" +
                        "- 13.4-inch InfinityEdge 4K UHD display for vibrant visuals.\n" +
                        "- Intel Core i5 processor for reliable performance.\n" +
                        "- 16GB RAM for efficient multitasking.\n" +
                        "- 512GB SSD for fast read/write speeds.\n" +
                        "- Sleek aluminum design for a premium feel.\n" +
                        "- Advanced thermal management system.\n" +
                        "- Long battery life for productivity on the go."));

        products.add(new Mobile("Electronics", 35000,
                "Apple iPhone SE:\n" +
                        "- Affordable smartphone with reliable performance.\n" +
                        "- A13 Bionic chip for smooth and responsive usage.\n" +
                        "- 4.7-inch Retina HD display with true tone.\n" +
                        "- Touch ID for secure and fast unlocking.\n" +
                        "- Single 12MP camera with Portrait mode.\n" +
                        "- Wireless charging capability.\n" +
                        "- Compact and lightweight design.\n" +
                        "- Water and dust resistance (IP67 certified)."));


// Adding Kitchen Appliances products
        products.add(new Cooker("Kitchen Appliances", 10000,
                "Prestige Rice Cooker:\n" +
                        "- Compact and efficient rice cooker for small families.\n" +
                        "- 1.8L capacity suitable for everyday use.\n" +
                        "- Automatic shut-off feature for safety.\n" +
                        "- Detachable inner pot for easy cleaning.\n" +
                        "- Comes with a measuring cup and spatula.\n" +
                        "- Energy-efficient design saves electricity.\n" +
                        "- Double-layered body for enhanced durability.\n" +
                        "- Cool-touch handles for easy portability."));

        products.add(new DryCleaner("Kitchen Appliances", 25000,
                "Samsung Handy Dry Cleaner:\n" +
                        "- Portable dry cleaner ideal for quick home use.\n" +
                        "- Compact and lightweight for easy storage.\n" +
                        "- Advanced fabric care technology for delicate clothes.\n" +
                        "- Removes wrinkles, odors, and allergens effectively.\n" +
                        "- Multiple fabric care modes for different materials.\n" +
                        "- Easy-to-use touch control panel.\n" +
                        "- Energy-efficient with low power consumption.\n" +
                        "- Durable build with a modern aesthetic design."));

        products.add(new Cooker("Kitchen Appliances", 20000,
                "Philips MultiCooker:\n" +
                        "- Multi-functional pressure cooker for versatile cooking.\n" +
                        "- 6L capacity ideal for larger families.\n" +
                        "- 15 preset cooking programs for various dishes.\n" +
                        "- Non-stick inner pot for easy cleaning.\n" +
                        "- Digital timer and delay start feature.\n" +
                        "- Safety lock mechanism for worry-free cooking.\n" +
                        "- Durable stainless steel exterior.\n" +
                        "- Energy-efficient design with minimal heat loss."));

        products.add(new DryCleaner("Kitchen Appliances", 35000,
                "LG High-Capacity Dry Cleaner:\n" +
                        "- Large drum capacity for heavy-duty cleaning.\n" +
                        "- Gentle care mode for delicate fabrics.\n" +
                        "- Steam technology removes stains and odors.\n" +
                        "- Intelligent sensor system for fabric protection.\n" +
                        "- Energy-efficient with eco-friendly settings.\n" +
                        "- Touch control panel with intuitive interface.\n" +
                        "- Sleek and modern design fits any home.\n" +
                        "- Quiet operation for a better user experience."));

        



    }




}
