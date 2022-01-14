package com.metehanbolat.retrofitmvvmjetpackcompose.view

import com.metehanbolat.retrofitmvvmjetpackcompose.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.size.Scale
import coil.transform.CircleCropTransformation
import com.metehanbolat.retrofitmvvmjetpackcompose.model.Movie

@Composable
fun MovieItem(movie: Movie) {
    Card(
        modifier = Modifier
            .padding(8.dp, 4.dp)
            .fillMaxWidth()
            .height(110.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp
    ) {
        Surface {
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxSize()
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(0.2f),
                    painter = rememberImagePainter(
                        data = movie.imageUrl,
                        builder = {
                            scale(Scale.FILL)
                            placeholder(R.drawable.ic_launcher_background)
                            transformations(CircleCropTransformation())
                        }
                    ),
                    contentDescription = movie.desc
                )
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxHeight()
                        .weight(0.8f),
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = movie.name,
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        modifier = Modifier
                            .background(Color.LightGray)
                            .padding(4.dp),
                        text = movie.name,
                        style = MaterialTheme.typography.caption,
                    )

                    Text(
                        text = movie.desc,
                        style = MaterialTheme.typography.body1,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }

}