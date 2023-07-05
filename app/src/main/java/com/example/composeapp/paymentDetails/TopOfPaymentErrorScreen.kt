package kg.optima.mobile.discounts.android.ui.pay.paymentDetails

//
//val customColor = Color(0xFFF7F6F9)
//val customColorGray = Color(0xFF999BA3)
//val ic_favorite = R.drawable.ic_favorite_icon
//val ic_show_receipt = R.drawable.ic_show_receipt_icon
//val ic_cross = R.drawable.ic_cross_icon
//val try_again = R.drawable.ic_try_again_icon
//
//@Composable
//internal fun TopOfPaymentErrorScreen() {
//
//    var selectedIndex by remember { mutableStateOf(-1) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = customColor)
//            .padding(top = 14.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            modifier = Modifier
//                .padding(top = 14.dp),
//            text = "Платеж не выполнен",
//            style = Typography().body1.copy(
//                fontWeight = FontWeight.Medium,
//                textAlign = TextAlign.Center,
//                fontSize = 18.sp,
//            ),
//        )
//
//        Box(
//            modifier = Modifier
//                .padding(top = 39.dp)
//                .size(80.dp)
//                .clip(RoundedCornerShape(20.dp))
//                .background(Color.White)
//        ) {
//            Icon(
//                modifier = Modifier.align(Alignment.Center),
//                imageVector = ImageVector.vectorResource(ic_cross),
//                contentDescription = "User Icon",
//                tint = MaterialTheme.colors.primary
//            )
//        }
//
//        Text(
//            modifier = Modifier
//                .padding(top = 28.dp),
//            text = "1 000,00 KGS",
//            style = Typography().body1.copy(
//                fontWeight = FontWeight.Bold,
//                textAlign = TextAlign.Center,
//                fontSize = 32.sp
//            ),
//        )
//
//        Text(
//            modifier = Modifier
//                .padding(top = 10.dp),
//            text = "Комиссия: 20,20 KGS",
//            color = customColorGray,
//            style = Typography().body1.copy(
//                fontWeight = FontWeight.Normal,
//                textAlign = TextAlign.Center,
//                fontSize = 16.sp
//            ),
//        )
//
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 40.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Boxes(
//                icon = ImageVector.vectorResource(try_again),
//                text = "Повторить платеж",
//                onClick = { selectedIndex = 0 },
//                textColor = if (selectedIndex == 0) Color.Black else customColorGray,
//                iconTint = if (selectedIndex == 0) Color.Black else customColorGray
//            )
//            Spacer(modifier = Modifier.width(3.5.dp))
//            Boxes(
//                icon = ImageVector.vectorResource(ic_favorite),
//                text = "Создать шаблон",
//                onClick = { selectedIndex = 1 },
//                textColor = if (selectedIndex == 1) Color.Black else customColorGray,
//                iconTint = if (selectedIndex == 1) Color.Black else customColorGray
//            )
//            Spacer(modifier = Modifier.width(3.5.dp))
//            Boxes(
//                icon = ImageVector.vectorResource(ic_show_receipt),
//                text = "Показать чек",
//                onClick = { selectedIndex = 2 },
//                textColor = if (selectedIndex == 2) Color.Black else customColorGray,
//                iconTint = if (selectedIndex == 2) Color.Black else customColorGray
//            )
//        }
//    }
//}
//
//@Composable
//private fun Boxes(
//    icon: ImageVector,
//    text: String,
//    onClick: () -> Unit,
//    textColor: Color = customColorGray,
//    iconTint: Color = customColorGray
//) {
//    Column(
//        modifier = Modifier
//            .height(84.dp)
//            .clickable(onClick = onClick),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly
//    ) {
//        ContainerWithIcon(icon = icon, tint = iconTint)
//        Text(
//            modifier = Modifier
//                .width(70.dp)
//                .padding(top = 8.dp),
//            text = text,
//            color = textColor,
//            textAlign = TextAlign.Center,
//            lineHeight = 16.sp,
//            fontSize = 14.sp,
//            fontWeight = FontWeight.Light
//        )
//    }
//}
//
//@Composable
//fun ContainerWithIcon(icon: ImageVector, tint: Color) {
//    Box(
//        modifier = Modifier
//            .width(70.dp)
//            .height(44.dp)
//            .background(color = Color.White, shape = RoundedCornerShape(20.dp))
//            .padding(4.dp),
//        contentAlignment = Alignment.Center
//    ) {
//        Icon(
//            imageVector = icon,
//            contentDescription = "Icon",
//            tint = tint
//        )
//    }
//}
