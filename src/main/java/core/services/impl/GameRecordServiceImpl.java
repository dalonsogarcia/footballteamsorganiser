package core.services.impl;

import org.springframework.stereotype.Service;
import core.repositories.GameRecordRepository;
import core.services.GameRecordService;

import javax.inject.Inject;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
public class GameRecordServiceImpl implements GameRecordService{

    @Inject
    private GameRecordRepository gameRecordRepository;

}
