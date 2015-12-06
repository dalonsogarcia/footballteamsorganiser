package core.services.impl;

import org.springframework.stereotype.Service;
import core.repositories.PlayerRepository;
import core.services.PlayerRecordService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by tommylii on 04/12/2015.
 */
@Service
@Transactional
public class PlayerRecordServiceImpl implements PlayerRecordService {

    @Inject
    private PlayerRepository playerRepository;
}
