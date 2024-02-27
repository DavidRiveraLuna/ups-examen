package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview(showBackground = true)
@Composable
fun chess() {
    Row(){
    Column(
        modifier = Modifier
            .height(480.dp)
            .width(400.dp)
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF))
                    .size(80.dp))
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF))
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.black_king),
                    contentDescription = "Black King",
                    modifier = Modifier.size(80.dp))
            }
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.black_rook),
                    contentDescription = "Black Rook",
                    modifier = Modifier.size(80.dp))
            }
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(80.dp))
            }
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(80.dp))
            }

            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.black_pawn),
                    contentDescription = "Black Pawn",
                    modifier = Modifier.size(80.dp))
            }
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )

        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.white_queen),
                    contentDescription = "White Queen",
                    modifier = Modifier.size(80.dp))
            }
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )

        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(80.dp))
            }
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(80.dp))
            }
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.white_pawn),
                    contentDescription = "White Pawn",
                    modifier = Modifier.size(80.dp))
            }


        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)


            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFFFFFFFF)
                    )
                    .size(80.dp)
            )
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF4CAF50)
                    )
                    .size(80.dp)){
                Image(
                    painter= painterResource(id  = R.drawable.whie_king),
                    contentDescription = "White King",
                    modifier = Modifier.size(80.dp))
            }

        }



    }
    }

}



