/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

class Doggo(val id: String,val name: String, val description: String, val about: String, val image: Int)

object DogProvider {
    val doggos = listOf(
        Doggo(
            "1",
            "Gina",
            "Adult | Female | Small | Red / Chestnut / Orange",
            "Adult Only Home Preferred, Affectionate, Crate Trained, Energetic, Goofy, Grooming Required, I can sit, Leash Trained, Likes Toys, No Small Children, Obedient, Playful, Single Dog Home",
            R.drawable.doggo_1
        ),

        Doggo(
            "2",
            "Annabelle",
            "Adult | Female | Medium",
            "Let me tell you about me and the reason I'm differently-abled. When I was just a couple of months old, a big dog bit my back. It injured my spine, and the vet couldn't fix it. My legs were not worked with so they would stay flexible, so I have a really cute way of getting around. I also have a wheelchair specially made with a whole lot of love by my Auntie Tammy. I am not able to control my bladder or bowels so they call me a diaper baby, my foster mommy can go over all of that and my special care if you think you might want to meet me.",
            R.drawable.doggo_2
        ),

        Doggo(
            "3",
            "Huck 2",
            "Young | Male | Medium | Tricolor (Brown, Black, & White)",
            "Meet Huck! He is a one year old, 41 lb, terrier mix, looking for the perfect family. Huck is incredibly affectionate and eager to please! He enjoys long walks, cookies and giving kisses. Huck gets very excited around other dogs, but we think with the right fit, he would enjoy a canine companion. He also doesn't mind cats! Huck can't wait to find a forever family, and he will give them all of the love and loyalty in the world! Huck is neutered and up to date on vaccinations and preventatives.",
            R.drawable.doggo_3
        ),

        Doggo(
            "4",
            "Ace",
            "Senior | Male | Large",
            "Sometimes you need an Ace up your sleeve. Thank goodness I did. I had a home and was cared for (you don't get my size without a little love). Then I found myself in a shelter where I played my best cards, and wouldn't you know it - jackpot. The defenders of dogs swept in and rescued me, paid for surgeries to remove the growth on my eye, clean my teeth, and we won't mention the other surgery, let's just say my bark is an octave higher now. I'm eight years old but still enjoy my daily walks",
            R.drawable.doggo_4
        ),

        Doggo(
            "5",
            "Dixie",
            "Adult | Female | Small",
            "Dixie is a sweet 3 year old girl (born 2018) and is a special needs dog since she is totally blind. She is a great dog and deserves a home that is accommodating of her needs.",
            R.drawable.doggo_5
        ),

        Doggo(
            "6",
            "Princess",
            "Adult | Female | Small",
            "Princess is one of four sweet Chihuahua mix puppies rescued together. She and her brother Bear are still available. Princess is spayed, vaccinated, microchipped and ready for her new home.",
             R.drawable.doggo_6
        ),

        Doggo(
            "7",
            "Aspen",
            "Puppy | Male | Small | White / Cream",
            "Loving, Playful",
             R.drawable.doggo_7
        ),
        Doggo(
            "8",
            "Priscilla Torin",
            "Adult | Female | Medium | White / Cream",
            "Meet Pricilla (aka Torin); this fabulous girl is an absolute sweetheart. She is a perfect size at about 40 lbs. She is very petite and delicate but yet strong and sturdy! She LOVES other dogs and will do best in a home with another dog to be her buddy. She is doggie door trained but must have a secure yard to be in. She likes to follow the lead of the other dog and will learn the rules quickly from them. She did live with a cat in her previous home and never hurt the kitty, but she did like to chase her. (So a cat that runs might not enjoy her company!) She is an all-around fun little girl; from her adorable zoomies to her snuggles, she is a fantastic girl looking for an excellent home.",
            R.drawable.doggo_8
        ),
        Doggo(
            "9",
            "Spenser",
            "Adult | Male | Medium | Black, White / Cream",
           "Spencer is a very sweet loving boy who loves to cuddle and play fetch. He gets along great with other animals and children. He is In the process of growing his hair after being shaved due to him coming in matted. We recommend this boy to anyone that is looking for a great/perfect family dog.",
            R.drawable.doggo_9
        ),
        Doggo(
            "10",
            "Duke 2",
            "Young | Male | Large | White / Cream",
           "Duke is a 1.5 year old, cattahoula mix, looking for his forever family. Duke is very affectionate, playful and eager to please. He knows certain commands, is house trained, does well on a leash and loves to play fetch. Duke can be picky with some dogs, and we are not sure how he is with cats, but he loves all people. We think Duke would enjoy the company of children in his new home. Duke is neutered, current on vaccinatoins and preventatives, and can't wait to meet you!",
            R.drawable.doggo_10
        ),

        )
}