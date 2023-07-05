package com.example.composeapp

//
//@Parcelize
//object ErrorPaymentScreen : BaseScreen {
//
//    @OptIn(ExperimentalMaterialApi::class)
//    @Composable
//    override fun Content() {
//        super.Content()
//
//        val product = remember {
//            DiscountsFeatureFactory.create<CategoriesIntent, CategoriesState>()
//        }
//
//        val state = product.state
//        val model by state.stateFlow.collectAsState(initial = UiState.Model.Initial)
//
//        MainContainer(
//            mainState = model,
//            contentModifier = Modifier.padding(Deps.Size.invisible),
//            sheetStatus = SheetStatus.NOT_DISMISSIBLE,
//            permissionController = null
//        ) {
//            TopOfPaymentErrorScreen()
//        }
//    }
//}

