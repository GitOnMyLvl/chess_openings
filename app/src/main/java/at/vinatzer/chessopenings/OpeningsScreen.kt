package at.vinatzer.chessopenings

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.Spring.DampingRatioLowBouncy
import androidx.compose.animation.core.Spring.StiffnessVeryLow
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import at.vinatzer.chessopenings.model.Opening
import at.vinatzer.chessopenings.model.OpeningRepository.openings

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun ChessOpeningsList(
    openings: List<Opening>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)

) {
    LazyColumn(
        modifier = modifier.padding(16.dp),
        contentPadding = contentPadding) {
        items(openings) {
            ChessOpening(opening = it, modifier = Modifier.padding(8.dp))
        }
    }
}


@Composable
fun ChessOpening(
    opening: Opening,
    modifier: Modifier = Modifier
) {
    var expended by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium),

        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .sizeIn(minHeight = 72.dp)
                .wrapContentSize(Alignment.Center)
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = DampingRatioLowBouncy,
                        stiffness = StiffnessVeryLow
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(id = opening.name),
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.displayMedium
            )
            Spacer(modifier = Modifier.size(8.dp))
            Image(
                painter = painterResource(id = opening.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clickable { expended = !expended }
                    .aspectRatio(1f)
            )
            if (expended) {
                Text(
                    text = stringResource(id = opening.notation),
                    modifier = Modifier.padding(top = 16.dp),
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview
@Composable
fun ChessOpeningPreview() {
    ChessOpening(opening = openings[0])
}